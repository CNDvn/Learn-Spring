package cnd.vn.demo.databaseconfig;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class DatabaseConnector {
    private String url;

    public abstract void connect();
}
