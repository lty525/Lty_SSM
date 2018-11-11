package cn.itcast.domain;

import java.io.Serializable;
import java.util.List;

public class Role implements Serializable {
    private String id;

    private String rolename;

    private String roledesc;
    private List<Permission> permissions;
    private List<Users> users;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public String getRoledesc() {
        return roledesc;
    }

    public void setRoledesc(String roledesc) {
        this.roledesc = roledesc;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    public List<Users> getUsers() {
        return users;
    }

    public void setUsers(List<Users> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id='" + id + '\'' +
                ", rolename='" + rolename + '\'' +
                ", roledesc='" + roledesc + '\'' +
                ", permissions=" + permissions +
                ", users=" + users +
                '}';
    }
}