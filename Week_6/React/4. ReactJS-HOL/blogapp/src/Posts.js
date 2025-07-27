import React from 'react';
import Post from './Post';

class Posts extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
      hasError: false,
    };
  }

  // Step 6: Fetch posts from API
  loadPosts = () => {
    fetch('https://jsonplaceholder.typicode.com/posts')
      .then(res => res.json())
      .then(data => {
        this.setState({ posts: data.slice(0, 10) }); // Limit to first 10 posts
      })
      .catch(error => {
        console.error('Error fetching posts:', error);
        this.setState({ hasError: true });
      });
  };

  // Step 7: Call loadPosts in componentDidMount
  componentDidMount() {
    this.loadPosts();
  }

  // Step 9: Catch rendering errors
  componentDidCatch(error, info) {
    alert('Something went wrong while rendering posts.');
    console.error("Error:", error);
    console.error("Info:", info);
  }

  // Step 8: Render posts
  render() {
    return (
      <div>
        <h2>Blog Posts</h2>
        {this.state.posts.map(post => (
          <Post key={post.id} title={post.title} body={post.body} />
        ))}
      </div>
    );
  }
}

export default Posts;
