CREATE DATABASE eadcw;
USE eadcw;

CREATE USER 'savindu'@'localhost' IDENTIFIED BY 'savindu';
GRANT ALL PRIVILEGES ON eadcw.* TO 'savindu'@'localhost';
FLUSH PRIVILEGES;

CREATE TABLE auth (
  `user` varchar(10) NOT NULL,
  `pass` varchar(45) NOT NULL,
  PRIMARY KEY (`user`)
);

CREATE TABLE Books (
    BookID INT AUTO_INCREMENT PRIMARY KEY,
    Title VARCHAR(100) NOT NULL,
    Author VARCHAR(100) NOT NULL,
    Category VARCHAR(25) NOT NULL
);

CREATE TABLE Members (
    MemberID INT AUTO_INCREMENT PRIMARY KEY,
    FullName VARCHAR(100) NOT NULL,
    Email VARCHAR(100) UNIQUE,
    Phone VARCHAR(15),
    Address TEXT,
    JoinDate DATE DEFAULT (CURRENT_DATE)
);

CREATE TABLE BorrowedBooks (
    BorrowID INT AUTO_INCREMENT PRIMARY KEY,
    MemberID INT,
    BookID INT,
    BorrowDate DATE DEFAULT (CURRENT_DATE),
    ReturnDate DATE,
    FOREIGN KEY (MemberID) REFERENCES Members(MemberID) ON DELETE CASCADE,
    FOREIGN KEY (BookID) REFERENCES Books(BookID) ON DELETE CASCADE
);

CREATE TABLE Fines (
    FineID INT AUTO_INCREMENT PRIMARY KEY,
    Reason VARCHAR(100) NOT NULL,
    BorrowID INT,
    FineAmount DECIMAL(10, 2) NOT NULL,
    DateIssued DATE DEFAULT (CURRENT_DATE),
    DatePaid DATE,
    FOREIGN KEY (BorrowID) REFERENCES BorrowedBooks(BorrowID) ON DELETE CASCADE
);

INSERT INTO auth VALUES ('Admin','Savindu');

-- Insert Books
INSERT INTO Books (Title, Author, Category)
VALUES 
('1984', 'George Orwell', 'Dystopian Fiction'),
('To Kill a Mockingbird', 'Harper Lee', 'Classic Fiction'),
('Pride and Prejudice', 'Jane Austen', 'Romance'),
('The Great Gatsby', 'F. Scott Fitzgerald', 'Classic Fiction');

-- Insert Members
INSERT INTO Members (FullName, Email, Phone, Address)
VALUES 
('John Doe', 'john.doe@example.com', '1234567890', '123 Elm Street'),
('Jane Smith', 'jane.smith@example.com', '9876543210', '456 Oak Avenue'),
('Robert Brown', 'robert.brown@example.com', '1122334455', '789 Pine Road'),
('Lucy White', 'lucy.white@example.com', '5566778899', '101 Maple Lane');

-- Insert BorrowedBooks
INSERT INTO BorrowedBooks (MemberID, BookID)
VALUES 
(1, 1),  -- John Doe borrows '1984'
(2, 3),  -- Jane Smith borrows 'Pride and Prejudice'
(3, 2),  -- Robert Brown borrows 'To Kill a Mockingbird'
(4, 4);  -- Lucy White borrows 'The Great Gatsby'

-- Insert Fines
INSERT INTO Fines (Reason, BorrowID, FineAmount)
VALUES 
("Damaged", 1, 5.00),  -- Fine for John Doe for overdue book
("Damaged", 2, 3.00);  -- Fine for Robert Brown for overdue book


