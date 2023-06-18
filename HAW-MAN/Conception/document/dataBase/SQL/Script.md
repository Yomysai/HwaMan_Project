
[[HAW_MAN_2023_06_09_01.png]]
-- Table "Users"
CREATE TABLE Users (
  user_id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
  username VARCHAR(255) NOT NULL,
  password VARCHAR(255) NOT NULL,
  email VARCHAR(255) NOT NULL
);

-- Table "Roles"
CREATE TABLE Roles (
  role_id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
  role_name VARCHAR(255) NOT NULL
);

-- Table "Teams"
CREATE TABLE Teams (
  group_id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
  group_name VARCHAR(255) NOT NULL
);

-- Table "Items"
CREATE TABLE Items (
  item_id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
  title VARCHAR(255) NOT NULL,
  author VARCHAR(255) NOT NULL,
  description TEXT NOT NULL,
  cover_image VARCHAR(255) NOT NULL,
  item_type VARCHAR(255) NOT NULL
);

-- Table "Mangas"
CREATE TABLE Mangas (
  manga_id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
  manga_specific_column1 VARCHAR(255),
  manga_specific_column2 VARCHAR(255)
);

-- Table "Books"
CREATE TABLE Books (
  book_id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
  book_specific_column1 VARCHAR(255),
  book_specific_column2 VARCHAR(255)
);

-- Table "Comments"
CREATE TABLE Comments (
  comment_id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
  item_id INT NOT NULL,
  item_type VARCHAR(255) NOT NULL,
  user_id INT NOT NULL,
  comment_text TEXT NOT NULL,
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Table "UserRoles"
CREATE TABLE UserRoles (
  user_role_id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
  user_id INT NOT NULL,
  role_id INT NOT NULL
);

-- Table "UserTeams"
CREATE TABLE UserTeams (
  user_group_id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
  user_id INT NOT NULL,
  group_id INT NOT NULL
);

-- Table "GroupRoles"
CREATE TABLE GroupRoles (
  group_role_id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
  group_id INT NOT NULL,
  role_id INT NOT NULL
);

-- Table "Pages"
CREATE TABLE Pages (
  page_id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
  item_id INT NOT NULL,
  page_number INT NOT NULL,
  content TEXT NOT NULL
);

-- Table "Images"
CREATE TABLE Images (
  image_id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
  item_id INT NOT NULL,
  image_url VARCHAR(255) NOT NULL
);

-- Table "Categories"
CREATE TABLE Categories (
  category_id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
  item_id INT NOT NULL,
  category_name VARCHAR(255) NOT NULL
);

-- Add foreign key constraints using ALTER TABLE

-- Table "Mangas"
ALTER TABLE Mangas
ADD FOREIGN KEY (manga_id) REFERENCES Items(item_id);

-- Table "Books"
ALTER TABLE Books
ADD FOREIGN KEY (book_id) REFERENCES Items(item_id);

-- Table "Comments"
ALTER TABLE Comments
ADD FOREIGN KEY (item_id) REFERENCES Items(item_id),
ADD FOREIGN KEY (user_id) REFERENCES Users(user_id);

-- Table "UserRoles"
ALTER TABLE UserRoles
ADD FOREIGN KEY (user_id) REFERENCES Users(user_id),
ADD FOREIGN KEY (role_id) REFERENCES Roles(role_id);

-- Table "UserTeams"
ALTER TABLE UserTeams
ADD FOREIGN KEY (user_id) REFERENCES Users(user_id),
ADD FOREIGN KEY (group_id) REFERENCES Teams(group_id);

-- Table "GroupRoles"
ALTER TABLE GroupRoles
ADD FOREIGN KEY (group_id) REFERENCES Teams(group_id),
ADD FOREIGN KEY (role_id) REFERENCES Roles(role_id);

-- Table "Pages"
ALTER TABLE Pages
ADD FOREIGN KEY (item_id) REFERENCES Items(item_id);

-- Table "Images"
ALTER TABLE Images
ADD FOREIGN KEY (item_id) REFERENCES Items(item_id);

-- Table "Categories"
ALTER TABLE Categories
ADD FOREIGN KEY (item_id) REFERENCES Items(item_id);


 
 
 