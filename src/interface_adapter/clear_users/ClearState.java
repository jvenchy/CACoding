package interface_adapter.clear_users;

// TODO Complete me

public class ClearState {

    private String deleted_users = "";

    public ClearState(ClearState copy){
        this.deleted_users = deleted_users;
    }

    public ClearState(){}

    public String get_deleted_users(){
        return deleted_users;
    }

    public void setDeleted_users(String deleted_users){
        this.deleted_users = deleted_users;
    }

    public String toString(){
        return "ClearState{" +
                "cleared users='" + deleted_users + '\'' +
                '}';
    }


}
