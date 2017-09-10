# DockerMavenMysqlTest
Create Spring Boot app that connect to MySql Server in other docker container

First need run other container which start MySql Server (look at MySqlServerTest repo). 
Than need to check IP adress for this MySql Server container in docker bridge network :
docker network inspect bridge

Than compare this address with url in application.properties.
After all above steps build and run this image.
