CREATE TABLE IF NOT EXISTS task
(
  id BIGINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
  name TINYTEXT,
  description TEXT,
  status TINYINT
)
