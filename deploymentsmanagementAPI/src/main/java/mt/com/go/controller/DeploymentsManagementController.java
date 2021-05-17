package mt.com.go.controller;

import mt.com.go.config.AppConfig;
import mt.com.go.config.ControllerConstants;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import static mt.com.go.config.ControllerConstants.SERVICE_CONFIG_VARS;
import static mt.com.go.config.ControllerConstants.SERVICE_SYSTEMS_DEPLOYMENTS_BY_DATE;


@Path(ControllerConstants.API_BASE_URL)
public class DeploymentsManagementController {

    @Inject
    AppConfig appConfig;

    @GET
    @Path(SERVICE_CONFIG_VARS)
    @Produces(MediaType.TEXT_HTML)
    public String configVars() {
        return "<html>" +
                "<br/> ConfiguredVars: "+
                "<br/> FileSystemPath: " + appConfig.getFileSystemPath() +
                "<br/> FilenameRegex : " + appConfig.getFilenameRegex() +
                "<br/> FileExtension : " + appConfig.getFileExtension() +
                "<br/> FileScanFixedRateMilliSeconds    : " + appConfig.getFileScanFixedRateMilliSeconds() +
                "<br/> FileScanInitialDelayMilliSeconds :" + appConfig.getFileScanInitialDelayMilliSeconds() +
                "<br/> DbName     :" + appConfig.getDbName() +
                "<br/> DbURL      :" + appConfig.getDbURL() +
                "<br/> ServerPort :" + appConfig.getServerPort() +
                "</html>";
    }

    @GET
    @Path(SERVICE_SYSTEMS_DEPLOYMENTS_BY_DATE)
    @Produces(MediaType.APPLICATION_JSON)
    public String getSystemsDeploymentByDate(@PathParam String deploymentDate) {
        return "Hello RESTEasy - Date entered is: " + deploymentDate;
    }


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/greetingFixed")
    public String greetingFixed() {
        return "Hello fixed greeting !";
    }


}