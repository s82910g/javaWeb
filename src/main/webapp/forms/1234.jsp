<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
    </head>
    <body tyle="padding: 20px">
       <form method="post" class="pure-form" action="/JavaWeb0829/servlet/upload" enctype="multipart/form-data">
            <fieldset>
                <legend>上傳圖片</legend>
                <input type="file"name="myfilel" /><p />
                <input type="text" placeholder="請輸入圖片名稱" name="descl" /><p />
                <button type="submit" class="pure-button pure-button-primary">上傳</button>
            </fieldset>
        </form>
    </body>
</html>
