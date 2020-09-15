layui.use(['layer'],function () {
    var layer = layui.layer;
})
$(function () {
    // 登陆事件
    $('#loginBtn').click(function () {
        login();
    });
});
// 校验验证码、用户名、密码
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
    if (!validateCode()){
        //阻断提示
    }else {
        var loginUsername = $('#loginUsername').val();
        var loginPassword = $('#loginPassword').val();
        //debugger;
        var loginLoadIndex = layer.load(2);
        $('#loginBtn').val("正在登录...");
        $.ajax({
            type: 'post',
            url: 'localhost:8080/user/login',
            dataType: 'text',
            data: {"userName": loginUsername, "passWord": loginPassword},
            contentType: 'application/json',
            success: function (data) {
                //var jsonData = JSON.parse(data);
                if (data.state == '200') {
                    window.location.href = '../index.html';
                }
            },
            error: function () {
                alert("系统出现错误");
            }
        });
    }
}