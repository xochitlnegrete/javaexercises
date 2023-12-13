package com.org.xochitl.java17;

public record Account(String name, String password, boolean privileged) {
    public  Account(String name, String password)   {
        this(name, password, false);
    }

    public String identifier()  {
        return "@" + name;
    }

    public void hasPrivileges() {
        if(this.privileged) {
            System.out.println("Access approved");
        }
        else {
            System.out.println("Access denied");
        }
    }
}
