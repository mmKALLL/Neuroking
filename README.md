# Neuroking
Now at version 0.1.1! <br />
Readme last updated on 2016-10-04. <br />
Currently working on: Coming up with progressive integration tests to define what the software should do on a higher level.

Neuroking is a tool for designing neural networks, which can do various computations and optimize themselves to do those computations quite accurately. The basic idea is to generalize a problem based on some training data, while using advanced techniques to ensure that the generalization accuracy is as good as possible. The main problem currently is that using these technologies requires a lot of domain knowledge or a background in programming, but with an incremental UI that hides unnecessary information this can be easy and even fun.

Therefore, Neuroking aims to accomplish two things: <br />
1) Make it easy for anyone to utilize the power of machine learning <br />
2) Allow people to share their creations with others <br />

In my opinion, it should be possible to accomplish these goals while making the source code available. <br />
If it becomes popular, I might aim to allow people to monetize their modules in an app-store style. <br />

The basic structure is more or less ready, so from here on I'll be venturing into unexplored territory and make something completely new. <br />

Since this is a project which I'm only working on during my free time, it will most likely take a while to flesh out new features... However, said features will definitely be full of awesome. <br />

There's not a whole lot going on yet, but stay tuned! <br />

## Roadmap
Planned for 0.2:
- Create Systems - they will manage the network and optimize the parameters to smartly maximize a fitness function.
- Nodes with optimizable parameters
- Nodes which pass sums of their inputs to their outputs
- Weak and strong weighted connections

Planned for 0.3:
- Systems should be configurable
- More node types
- Automated and easily expandable test suite
- Simple text based UI with save/load (e.g. CSV); start on user testing

Planned for 0.4:
- More representations of output data (graphical RGB, graph, output to file)
- The ability to save each generation's data (custom format)

Planned for 0.5:
- Output generation-by-generation data into customizable "graphs" (exportable data points are sufficient)
- More ways to input (previous gen, rows from a file, part of the screen as RGB values)

Planned for 0.6:
- Nodes with parametrized biases and thresholds between different value ranges
- Systems having interconnected networks, with outputs connected to inputs

Planned for 0.7:
- Config files
- Multiple modes of operation (interactive, let it run x generations, debug, hands-off, ...)
- Brief tutorial and user documentation

Planned for 0.8:
- Expanded test suite with extensive integration tests
- Start work on connecting the core with an arbitrary GUI


## Release notes:

0.1:
- Initial release
- Can create nodes and insert them into a network
- Three node types
    - ConsoleInput - takes in text from the console and passes it to connected nodes
    - RelayProcessor - passes all input data unmodified to all outputs
    - ConsoleOutput - prints all received input to the console
- Much of the structural backbone is in place

## Known issues:

- Output nodes are processed in the order they were added into the network
- Eclipse sometimes fails to recognize the package structure (unless all files are opened...)
- ~~Too many todos :)~~ fixed
