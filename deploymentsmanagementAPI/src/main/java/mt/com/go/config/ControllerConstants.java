package mt.com.go.config;

public class ControllerConstants {

        private ControllerConstants() {}

        public final static String API_URL_PREFIX = "/api/deploymentsmanagement";
        public final static String URL_VERSION = "/v1";
        public final static String API_NAME = "/deployments";
        public final static String API_BASE_URL = API_URL_PREFIX + URL_VERSION + API_NAME;


        public static final String PATH_VAR_DEPLOYMENT_DATE = "deploymentDate";
        public static final String PATH_VAR_DATE_FROM = "dateFrom";
        public static final String PATH_VAR_DATE_TO = "dateTo";

        public static final String SERVICE_CONFIG_VARS = "/configVars";
        public static final String SERVICE_SYSTEMS_DEPLOYMENTS_BY_DATE = "/deploymentDate:{deploymentDate}";
        public static final String SERVICE_SYSTEMS_DEPLOYMENTS_BY_STATUS = "/postDeploymentTaskStatus:{deploymentStatus}";
        public static final String SERVICE_SYSTEMS_DEPLOYMENT_DURATION_BY_DATE = "/deploymentDurationByDate:{deploymentDate}";
        public static final String SERVICE_SYSTEMS_DEPLOYMENT_WITHIN_DATE_RANGE = "/deploymentDateRange:{dateFrom}-{dateTo}";
        public static final String SERVICE_DEPLOYMENTS_BY_SYSTEM = "/system:{systemName}";

        public static final String SERVICE_RELOAD_FILES = "/reload";

        /**
         * Date regex format: yyyyMMdd example: 20201201
         */
        public static final String MAPPING_DATE_REGEX = "^20[0-9]{2}((0(1|3|5|7|8)|10|12)(((0|1|2)[1-9])|3[0-1])|(0(4|6|9)|11)(((0|1|2)[1-9])|30)|02((0[1-9])|((1|2)[0-9])))";



}
