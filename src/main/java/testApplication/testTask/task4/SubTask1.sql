SELECT COUNT(users.userid) as inactive_users FROM users
WHERE users.userid NOT IN( SELECT usersessions.userid FROM usersessions);