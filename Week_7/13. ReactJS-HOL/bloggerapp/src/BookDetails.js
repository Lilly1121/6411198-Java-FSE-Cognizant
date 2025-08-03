import React from 'react';

function BookDetails() {
  const books = [
    { title: "Master React", price: 670 },
    { title: "Deep Dive into Angular 11", price: 800 },
    { title: "Mongo Essentials", price: 450 }
  ];

  return (
    <div className="column">
      <h2>Book Details</h2>
      {books.map((book, index) =>
        book.price > 400 ? ( // Conditional Rendering using ternary
          <div key={index}>
            <h3>{book.title}</h3>
            <p>{book.price}</p>
          </div>
        ) : null
      )}
    </div>
  );
}

export default BookDetails;
