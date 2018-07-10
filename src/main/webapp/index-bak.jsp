<html>
<body>
<h2>Hello World!</h2>
    <form name="form" id="form" action="login.do" method="post">
      <table>
        <tr>
          <td class="text">Username:</td>
          <td><input type="text" name="username" id="username"></td>  
        </tr>
        
        <tr>
          <td class="text">Password:</td>
          <td><input type="password" name="password" id="password"></td>
        </tr> 
        
        <tr>
          <td colspan="2" align="center"><input type="submit" value="Login">&nbsp;<input type="submit" value="register"></td>
        </tr>
        
        <tr>
          <td colspan="2" align="center">
          	<label id="message" class="red">
          		${message}
          		
          	</label>
          </td>
        </tr>
      </table>
    </form>
</body>
</html>
