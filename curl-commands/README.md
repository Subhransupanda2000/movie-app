# Update Movie:
curl --location --request PUT 'localhost:8080/movies/2' \
--header 'Content-Type: application/json' \
--data '{
    "id":2,
    "title":"mno"
}'
# Movie list:
curl --location 'localhost:8080/movies'
# Create movie:
curl --location --request POST 'localhost:8080/movies' \
--data ''
# delete movie:
curl --location --request DELETE 'localhost:8080/movies/1'
# MovieById:
curl --location 'localhost:8080/movies/2'
