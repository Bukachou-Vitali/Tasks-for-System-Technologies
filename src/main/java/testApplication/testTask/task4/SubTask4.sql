SELECT COUNT(*) as qwer, mama.mobappversion FROM (SELECT * FROM usersessions
WHERE (mobosversion <=80 OR mobosversion IS null)) as mama
GROUP BY mama.mobappversion;