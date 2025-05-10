INSERT INTO categories (name)
VALUES ('Produce'),      -- 1
       ('Dairy'),        -- 2
       ('Bakery'),       -- 3
       ('Meat'),         -- 4
       ('Beverages'),    -- 5
       ('Frozen Foods'), -- 6
       ('Pantry'),       -- 7
       ('Snacks'),       -- 8
       ('Seafood'),      -- 9
       ('Personal Care'); -- 10

INSERT INTO products (name, price, description, category_id)
VALUES ('Organic Bananas', 1.99, 'A bunch of fresh organic bananas from Ecuador.', 1),                   -- Produce
       ('Whole Milk - 1 Gallon', 3.49, 'Pasteurized whole milk from local farms.', 2),                   -- Dairy
       ('Sourdough Bread', 4.29, 'Artisan sourdough bread, baked fresh daily.', 3),                      -- Bakery
       ('Boneless Chicken Breast', 6.99, 'Skinless boneless chicken breasts, antibiotic-free.', 4),-- Meat
       ('Orange Juice - No Pulp', 4.59, '100% orange juice with no pulp. Fortified with Vitamin C.', 5), -- Beverages
       ('Frozen Broccoli Florets', 2.99, 'Steamable bag of frozen organic broccoli.', 6),                -- Frozen Foods
       ('Pasta - Penne Rigate', 1.89, 'Italian durum wheat pasta. Cooks in 11 minutes.', 7),             -- Pantry
       ('Potato Chips - Sea Salt', 3.49, 'Kettle-cooked sea salt potato chips.', 8),                     -- Snacks
       ('Atlantic Salmon Fillet', 9.99, 'Fresh Atlantic salmon fillet, skin on.', 9),                    -- Seafood
       ('Toothpaste - Mint Gel', 2.79, 'Fluoride toothpaste for fresh breath and cavity protection.',
        10); -- Personal Care
