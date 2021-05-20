SELECT DISTINCT users.userid FROM users
INNER JOIN usersessions ON users.userid = usersessions.userid
WHERE usersessions.channeltype <> 1;