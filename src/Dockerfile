# Базовый образ для Java
FROM openjdk:11

# Устанавливаем необходимые пакеты
RUN apt-get update && apt-get install -y maven git

# Копируем исходный код проекта в контейнер
COPY .. /usr/src/app

# Устанавливаем рабочую директорию
WORKDIR /usr/src/app

# Собираем проект
RUN mvn clean install

# Запускаем генерацию документации
CMD ["mvn", "javadoc:javadoc"]