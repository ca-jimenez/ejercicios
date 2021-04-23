
USE movies_db;

/*ejercicio 1*/
SELECT s.title, g.name
FROM series as s
JOIN genres as g
ON s.genre_id = g.id;

/*ejercicio 2*/
SELECT e.title, a.first_name, a.last_name
FROM episodes e
JOIN actor_episode ae
ON e.id = ae.episode_id
JOIN actors a
ON a.id = ae.actor_id;


/*ejercicio 3*/
SELECT ser.title, count(*) as seasons
FROM series ser
JOIN seasons sea
ON ser.id = sea.serie_id
GROUP BY ser.title;

/*ejercicio 4*/
SELECT g.name as genres, count(*) as total_movies
FROM genres g
JOIN movies m
ON g.id = m.genre_id
GROUP BY g.name
HAVING total_movies >= 3;

/*ejercicio 5*/
SELECT a.first_name, a.last_name
FROM actors a
JOIN actor_movie am
ON am.actor_id = a.id
JOIN movies m
ON m.id = am.movie_id
WHERE m.title LIKE 'La guerra de las galaxias%'
GROUP BY a.first_name, a.last_name
HAVING count(*) = (
SELECT count(*)
FROM movies m
WHERE m.title LIKE 'La guerra de las galaxias%'
)

