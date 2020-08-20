CREATE DEFINER=`root`@`localhost` PROCEDURE `persona_search`(IN pid_persona INT, OUT pnombre VARCHAR(45), OUT papellidos VARCHAR(45))
BEGIN
	
    DECLARE id_buscado INT;
    
	IF pid_persona > 0 THEN
		
        SELECT id_persona INTO id_buscado FROM persona WHERE id_persona = pid_persona;
        #SET id_buscado = SELECT id_persona FROM persona WHERE id_persona = pid_persona;
		
        #SELECT id_buscado;        
        
        IF id_buscado IS NOT NULL THEN        
			SELECT nombre, apellidos INTO pnombre, papellidos FROM persona WHERE id_persona = pid_persona;
        END IF;
         
	END IF;
END