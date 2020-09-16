layui.use(['layer'],function () {
    var layer = layui.layer;
})
$(function () {
    // 登陆事件
    $('#loginBtn').click(function () {
        login();
    });
});
// 校验用户名、密码
function validateCode() {
    var loginUsername = $('#loginUsername').val();
    var loginPassword = $('#loginPassword').val();
    if ($.trim(loginUsername) == '' || $.trim(loginUsername).length<=0){
        layer.alert("用户名不能为空");
        return false;
    }
    if ($.trim(loginPassword) == '' || $.trim(loginPassword).length<=0){
        layer.alert("密码不能为空");
        return false;
    }
    return true;
}
// 登录流程
function login() {
    debugger;
    if (!validateCode()){
        alert("用户名或密码不能为空");
    }else {
        var loginUsername = $('#loginUsername').val();
        var loginPassword = $('#loginPassword').val();
        //$('#loginBtn').val("正在登录...");
        $.ajax({
            type: 'POST',
             url: 'http://localhost:8080/user/login',
            // url: 'localhost:8080/user/login?passWord=sdfsdfsdf&userName=123456',
            dataType: 'JSON',
            data: {
                "userName": loginUsername,
                "passWord": loginPassword
            },
           // contentType: 'application/json',
            success: function (data) {
                if (data.state == '200') {
                    alert(data.explain);
                    window.location.href = '../user/loginss';
                }else {
                    alert(data.explain);
                }
            },
            error: function () {
                alert("系统出现错误");
            }
        });
    }
}