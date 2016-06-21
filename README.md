#Neuroking
A neural network design tool, now at version 0.1.0.0! <br />
Readme last updated on 2016-06-18. <br />
Currently working on: Refactoring the high-level architecture, analysis to help with decision-making

Note to self: Processor nodes vs Hidden nodes; rename package structure to Neuroking

Neuroking aims to accomplish two things: <br />
1) Make it easy for anyone to utilize the power of machine learning <br />
2) Allow people to share their creations with others <br />

In my opinion, it should be possible to accomplish these goals while making the source code available. <br />
If it becomes popular, I might aim to allow people to monetize their modules in an app-store style. <br />

The basic structure is more or less ready, but will most likely go through a couple of reiteration cycles to ensure maximal quality before I really dig into it. <br />

Since this is a project which I'm only working on during my free time, it will most likely take a while to flesh out new features... However, said features will definitely be full of awesome. <br />

There's not a whole lot going on yet, but stay tuned! <br />

##Roadmap
Planned for 0.2:
- Create Systems - they will manage the network and optimize the parameters to maximize a fitness function.
- Nodes with optimizable parameters
- Nodes which pass sums of their inputs to their outputs
- Weak and strong weighted connections

Planned for 0.3:
- Systems should be configurable
- More node types
- Automated and easily expandable test suite
- Simple text based UI; start on user testing

Planned for 0.4:
- More representations of output data (graphical RGB, graph, output to file)
- The ability to save each generation's data

Planned for 0.5:
- Output generation-by-generation data into customizable "graphs" (exportable data points are sufficient)
- More ways to input (previous gen, rows from a file, part of the screen as RGB values)

Planned for 0.6:
- Nodes with parametrized biases and thresholds between different value ranges (with e.g. sigmoid functions)
- Systems of Systems; multiple interconnected networks

Planned for 0.7:
- Config files
- Multiple modes of operation (interactive, let it run x generations, debug, hands-off, ...)
- Brief tutorial and documentation

Planned for 0.8:
- Expanded test suite with extensive integration tests
- Start work on connecting the core with an arbitrary GUI


##Release notes:

0.1:
- Initial release
- Can create nodes and insert them into a network
- Three node types
    - ConsoleInput - takes in text from the console and passes it to connected nodes
    - RelayProcessor - passes all input data unmodified to outputs
    - ConsoleOutput - prints all received input to the console
- Much of the structural backbone is in place

## Known issues:

- Output nodes are processed in the order they were added into the network.
- Builds sometimes fail to recognize package structure
- Too many todos :)
