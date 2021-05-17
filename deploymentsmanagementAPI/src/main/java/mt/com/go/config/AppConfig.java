package mt.com.go.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import lombok.Getter;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@ApplicationScoped
@Named("appConfig")
@Getter
public class AppConfig {

    private final String DB_PROPERTY = "mongoDBURL";

    @ConfigProperty(name = "message", defaultValue="hello default")
    String message;

    @ConfigProperty(name = "fileSystemPath")
    String fileSystemPath;

    @ConfigProperty(name = "fileNameRegex")
    private String filenameRegex;

    @ConfigProperty(name = "fileExtension")
    private String fileExtension;

    @ConfigProperty(name = "fileScanFixedRateMilliSeconds")
    private  Integer fileScanFixedRateMilliSeconds;

    @ConfigProperty(name = "fileScanInitialDelayMilliSeconds")
    private  Integer fileScanInitialDelayMilliSeconds;

    @ConfigProperty(name = "mongDBConnectDatabase")
    private String dbName;

    @ConfigProperty(name = "mongoDBURL")
    private String dbURL;

    @ConfigProperty(name = "server.port")
    private int serverPort;

    public MongoClient mongoClient() {
        return (System.getProperty(DB_PROPERTY) != null) ? MongoClients.create(System.getProperty(DB_PROPERTY)) : MongoClients.create(dbURL);
    }

}
