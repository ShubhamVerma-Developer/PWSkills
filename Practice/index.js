




var jpdbBaseUrl = "http://api.login2explore.com:5577";
var jpdbIRL = '/api/irl';
var jpdbIML = '/api/iml';
var empDBName ='EMP-DB';
var empRelationName = 'EmpData';
var connToken = '90932379|-31949271503826183|90955528';

$('#empid').focus();

function saveRecNo2LS(jsonObj){
    var lvData = JSON.parse(jsonObj.data);
    localStorage.setItem('recno', lvData.rec_no);
}

function getEmpIdAsJsonObj(){
    var empid = $('#empid').val();
    var jsonStr = {
        id: empid
    };
    return JSON.stringify(jsonStr);
    }


function fillData(jsonObj){
    saveRecNo2LS(jsonObj);
    var record = JSON.parse(jsonObj.data).record;
    $("#empname").val(record.name);
    $("#empsal").val(record.salary);
    $("#hra").val(record.hra);
    $("#da").val(record.da);
    $("#deduct").val(record.deduction);
}

function resetForm() {
    $("#empid").val("");
    $("#empname").val("");
    $("#empsal").val("");
    $("#hra").val("");
    $("#da").val("");
    $("#deduct").val("");
    $("#empid").prop("disabled", false);
    $("#save").prop("disabled", true);
    $("#change").prop("disabled", true);
    $("#reset").prop("disabled", true);  
    $("#empId").focus();
}

function validateData(){
    var empid, empname, empsal, hra, da, deduct;
    empid = $('#empid').val();
    empname = $('#empname').val();
    empsal = $('#empsal').val();
    hra = $('#hra').val();
    da = $('#da').val();
    deduct = $('#deduct').val();
    
     if (empid === "") {
        alert("Employee ID is Missing");
        $("#empid").focus();
        return "";
        }
     if (empname === "") {
        alert("Employee Name is Missing");
        $("#empname").focus();
        return "";
        } 
     if (empsal === "") {
        alert("Employee Salary is Missing");
        $("#empsal").focus();
        return "";
        }
     if (hra === "") {
        alert("HRA is Missing");
        $("#hra").focus();
        return "";
        }
     if (da === "") {
        alert("DA is Missing");
        $("#da").focus();
        return "";
        }
     if (deduct === "") {
        alert("Employee ID is Missing");
        $("#deduct").focus();
        return "";
        }
     var jsonStrObj = {
         id: empid,
         name: empname,
         salary: empsal,
         hra: hra,
         da: da,
         deduct: deduct
        };
        return JSON.stringify(jsonStrObj);
}

function saveData(){
    var jsonStrObj = validateData();
    if(jsonStrObj ===''){
        return "";
    }
    var putRequest = createPutRequest(connToken, jsonStrObj, empDBName, empRelationName);
     jQuery.ajaxSetup({async: false});
    var resJsonObj = executeCommandAtGivenBaseUrl(putRequest, jpdbBasePL, jpdbIML);
     jQuery.ajaxSetup({async: true});
    resetform();
    $('#empid').focus();
}


function getEmp(){
    var empIdJsonObj = getEmpIdAsJsonObj();
    var getRequest = createGET_BY_KEYRequest(connToken, empDBName, empRelationName, empIdJsonObj);
    jQuery.ajaxSetup({async: false});
    var resJsonObj = executeCommandAtGivenBaseUrl(updateRequest, jpdbBaseURL, jpdbIML);
    jQuery.ajaxSetup({async: true});    
   if (resJsonObj.status === 400){
    $("#save").prop("disabled", false);
    $("#reset").prop("disabled", false);
    $("#empname").focus();
   } else if(resJsonObj.status == 200){
    $("#empid").prop("disabled", true);
    fillData(resJsonObj);

    $("#change").prop("disabled", false);
    $("#reset").prop("disabled", false);
    $("#empname").focus();
   }
}


function changeData(){
    $('#change').prop('disabled', true);
    jsonChg = validateData();
    var updateRequest = createUPDATERecordRequest(connToken, jsonChg, empDBName, empRelationName, localStorage.getItem(''));
    jQuery.ajaxSetup({async: false});
    var resJsonObj = executeCommandAtGivenBaseUrl(updateRequest, jpdbBaseURL, jpdbIML);
    jQuery.ajaxSetup({async: true});    
    console.log(resJsonObj);
    resetform();
    $('#empid').focus();
}