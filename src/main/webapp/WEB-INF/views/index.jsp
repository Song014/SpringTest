<%--
  Created by IntelliJ IDEA.
  User: thdrl
  Date: 2023-06-07
  Time: 오후 8:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://code.jquery.com/jquery-3.7.0.min.js"></script>
</head>
<body>
    <h1>ajax test</h1>
    <input type="button"  value="유저 확인" onclick="findUser()">
    <input type="button"  value="리셋" onclick="resetUser()">
    <div class="content">

    </div>
    <script>
        function findUser(){
            $.ajax({
                url: "test",
                type: "POST",
                dataType: "json",
                contentType: "application/x-www-form-urlencoded; charset=UTF-8",
                success : function(reslut) {
                    const list = reslut.list.map(function (obj) {
                        var data = {
                            "id":obj.id,
                            "name":obj.name,
                            "email":obj.email
                        }
                        return data;
                    });
                    let html ='';
                    for (let i = 0; i < list.length; i++) {
                        html += `
                        id: `+list[i].id+` <br>
                        name: `+list[i].name+` <br>
                        email: `+list[i].email+` <br>
                        `
                    }
                    $(".content").html(html);
                },
                error : function(xhr, status, error){
                    console.log(error);
                }
            });
        }

        function resetUser(){
            $(".content").html('');
        }




    </script>
</body>
</html>
