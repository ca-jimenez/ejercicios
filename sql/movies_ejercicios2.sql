USE movies_db;

-- ejercicio 2
INSERT INTO movies (title, rating, awards, release_date, length, genre_id)
VALUES ('Inception', 8.5, 3, '2010-07-26 00:00:00', 120, 5);

-- ejercicio 3
INSERT INTO genres (name, ranking, active)
VALUES ('Comedia Romántica', 13, 1);

-- ejercicio 4
UPDATE movies
SET genre_id = 13
WHERE id = 22;

-- ejercicio 5
UPDATE actors
SET favorite_movie_id = 22
WHERE id = 12;

-- ejercicio 6
CREATE TEMPORARY TABLE IF NOT EXISTS movies_copy AS (SELECT * FROM movies);

-- ejercicio 7
DELETE FROM movies_copy
WHERE awards < 5
LIMIT 100;

SELECT * FROM movies_copy;

-- ejercicio 8
SELECT g.name
FROM genres g
JOIN movies m
ON m.genre_id = g.id
GROUP BY g.name;

-- v2
SELECT DISTINCT g.*
FROM genres g
JOIN movies m
ON m.genre_id = g.id;

-- v3
SELECT * FROM GENRES G
WHERE EXISTS(
	SELECT 1
	FROM MOVIES M
	WHERE G.ID = M.GENRE_ID 
    LIMIT 1
    );

-- ejercicio 9
SELECT CONCAT(a.last_name, ', ' , a.first_name) as actor
FROM actors a
JOIN movies m
ON a.favorite_movie_id = m.id
WHERE m.awards > 3;

-- ejercicio 10
EXPLAIN DELETE FROM movies_copy
WHERE awards < 5
LIMIT 100;

-- ejercicio 12
CREATE INDEX movie_name
ON movies (title);
