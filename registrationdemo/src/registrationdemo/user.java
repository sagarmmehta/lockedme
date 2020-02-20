package registrationdemo;

public class user 
{
    public String  username, password;
    
   
    public user(String[] parts)
    {
       
        username = parts[0];
        password = parts[1];
    }
    
    public boolean doesPasswordEqual(String password) {
        return this.password.equals(password);
    }

}
