SELECT COUNT(*) as qwer, mobappversion FROM usersessions
WHERE (mobosversion <80 OR mobosversion IS null)
GROUP BY mobappversion;