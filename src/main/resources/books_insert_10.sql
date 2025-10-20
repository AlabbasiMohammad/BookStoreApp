INSERT INTO books
(id, title, published_date, pages, language, description, price, stock, image, cover_image, genre_id, publisher_id)
VALUES
    (1, 'Clean Code: A Handbook of Agile Software Craftsmanship', '2008-08-11', 464, 'English',
     'Even bad code can function. But if code isn’t clean, it can bring a development organization to its knees.',
     38, 100, 'https://example.com/images/cleancode-thumb.jpg', 'https://example.com/images/cleancode-cover.jpg', 1, 1);

--     (2, 'The Pragmatic Programmer: Your Journey to Mastery', '1999-10-30', 352, 'English',
--      'A guide to becoming an adaptable, pragmatic, and effective programmer.',
--      42, 85, 'https://example.com/images/pragmatic-thumb.jpg', 'https://example.com/images/pragmatic-cover.jpg', 2, 1, 1, 2),
--
--     (3, 'Design Patterns: Elements of Reusable Object-Oriented Software', '1994-10-31', 395, 'English',
--      'Captures 23 classic software design patterns and how to apply them effectively.',
--      55, 60, 'https://example.com/images/designpatterns-thumb.jpg', 'https://example.com/images/designpatterns-cover.jpg', 3, 1, 2, 3),
--
--     (4, 'Refactoring: Improving the Design of Existing Code', '1999-07-08', 431, 'English',
--      'A practical guide to refactoring — restructuring existing code without changing its behavior.',
--      47, 70, 'https://example.com/images/refactoring-thumb.jpg', 'https://example.com/images/refactoring-cover.jpg', 4, 1, 2, 4),
--
--     (5, 'Introduction to Algorithms', '2009-07-31', 1312, 'English',
--      'Comprehensive coverage of algorithms, from sorting to advanced graph algorithms.',
--      99, 40, 'https://example.com/images/algorithms-thumb.jpg', 'https://example.com/images/algorithms-cover.jpg', 5, 2, 3, 5),
--
--     (6, 'Cracking the Coding Interview', '2015-07-01', 706, 'English',
--      '150 programming interview questions and detailed solutions.',
--      40, 50, 'https://example.com/images/cracking-thumb.jpg', 'https://example.com/images/cracking-cover.jpg', 6, 3, 4, 6),
--
--     (7, 'Effective Java', '2018-01-06', 416, 'English',
--      'A deep dive into best practices and patterns for writing effective Java code.',
--      54, 55, 'https://example.com/images/effectivejava-thumb.jpg', 'https://example.com/images/effectivejava-cover.jpg', 7, 1, 1, 7),
--
--     (8, 'You Don’t Know JS: Up & Going', '2015-03-10', 278, 'English',
--      'An introduction to core JavaScript concepts in the You Don’t Know JS series.',
--      30, 120, 'https://example.com/images/ydkjs-thumb.jpg', 'https://example.com/images/ydkjs-cover.jpg', 8, 4, 5, 8),
--
--     (9, 'JavaScript: The Good Parts', '2008-05-01', 176, 'English',
--      'Explores the elegant and robust features of JavaScript.',
--      25, 95, 'https://example.com/images/jsgoodparts-thumb.jpg', 'https://example.com/images/jsgoodparts-cover.jpg', 9, 4, 5, 9),
--
--     (10, 'Clean Architecture: A Craftsman’s Guide to Software Structure and Design', '2017-09-20', 432, 'English',
--      'A guide to building maintainable and flexible software architecture.',
--      46, 40, 'https://example.com/images/cleanarch-thumb.jpg', 'https://example.com/images/cleanarch-cover.jpg', 10, 1, 2, 10);