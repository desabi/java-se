CREATE DEFINER=`root`@`localhost` PROCEDURE `persona_update`(IN pid_persona INT, IN pnombre VARCHAR(45), IN papellidos VARCHAR(45))
BEGIN
	
    DECLARE id_buscado INT;
    
    SELECT id_persona INTO id_buscado FROM persona WHERE id_persona = pid_persona;
    
    IF id_buscado IS NOT NULL THEN
		UPDATE persona SET nombre = pnombre, apellidos = papellidos WHERE id_persona = pid_persona;
    END IF;
    
END