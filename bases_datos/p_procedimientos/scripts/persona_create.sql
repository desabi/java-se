CREATE DEFINER=`root`@`localhost` PROCEDURE `persona_create`(IN pnombre VARCHAR(45), papellidos VARCHAR(45))
BEGIN
	IF (pnombre > '') AND (papellidos > '') THEN
		INSERT INTO persona VALUES (34, pnombre, papellidos);
    END IF;
END