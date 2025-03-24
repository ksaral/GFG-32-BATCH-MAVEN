FROM openjdk:11.0
LABEL maintainer="saral.khare@gmail.com"

# Create a non-root user and group
RUN groupadd -r appuser && useradd -r -g appuser appuser

# Create working directory and set permissions
WORKDIR /app
COPY target/gfg-calculator.jar gfg-calculator.jar
RUN chown -R appuser:appuser /app

# Switch to the non-root user
USER appuser

# Run the application
ENTRYPOINT ["java", "-jar", "gfg-calculator.jar"]
