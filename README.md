# DOCUMENT 2 LATEX CONVERTER (BACK END) 

## Project information 
### Goal 

Still under construction

------------------------------------------------------------- 
## Technology information used 

This project was developed with [Sprint Boot 2.3.5](https://spring.io/projects/spring-boot) and [JDK 8](https://jdk.java.net/java-se-ri/8-MR3).

## Execution instructions
* You will must have installed [JDK 8](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html);
* After installing JDK 8, it will be necessary to configure a new environment variable containing the "bin" directory included in the extracted JDK 8 folder, for this, there are several ways, according to your operating system:
    * [How to set JDK environment variable on Windows](https://help.talend.com/reader/xvy_0njAOr18WEwe1erXIQ/fEgWNsXSyHZGM9qQBxWqkQ);
    * [How to set JDK environment variable on Linux](https://help.talend.com/reader/xvy_0njAOr18WEwe1erXIQ/8qRcf68tZRGOs4ppOIK_Kw);


For more information read the [oracle documentation](https://docs.oracle.com/cd/E19182-01/820-7851/inst_cli_jdk_javahome_t/).

* After cloning the repository, inside the project directory, enter the following command:
    * On Windows: `mvnw.cmd spring-boot:run`;
    * On Linux: `./mvnw spring-boot:run`;
    
* After that, the back end application will go up.
