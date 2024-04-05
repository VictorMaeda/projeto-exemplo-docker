# Pega a imagem da open jdk, essa versão alpine é uma versão mais leve
FROM openjdk:17-alpine
# cria uma variavel com o nome do .jar 	
ARG JAR_FILE=target/*.jar
#copia o .jar do meu projeto para o container 
COPY ${JAR_FILE} app.jar
#inicia a aplicação
ENTRYPOINT [ "java", "-jar", "/app.jar" ]