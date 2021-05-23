SELECT DISTINCT usersessions.userid FROM usersessions
WHERE usersessions.userid NOT IN( SELECT usersessions.userid FROM usersessions
WHERE usersessions.channeltype = 1);