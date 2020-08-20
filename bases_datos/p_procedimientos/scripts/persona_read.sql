CREATE DEFINER=`root`@`localhost` PROCEDURE `persona_read`()
BEGIN
	SELECT id_persona, nombre, apellidos FROM persona;
END