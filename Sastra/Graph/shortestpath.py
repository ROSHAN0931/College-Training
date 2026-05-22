class Queue:

    def __init__(self):
        self.items = []

    def enqueue(self, data):
        self.items.append(data)

    def dequeue(self):
        return self.items.pop(0)

    def is_empty(self):
        return len(self.items) == 0


class Graph:

    def __init__(self, total_nodes):

        self.total_nodes = total_nodes
        self.graph = {}

        for node in range(1, total_nodes + 1):
            self.graph[node] = []

    def add_edge(self, start, end):

        self.graph[start].append(end)
        self.graph[end].append(start)

    def shortest_distance(self, start_node):

        distance = [-1] * (self.total_nodes + 1)

        distance[start_node] = 0

        queue = Queue()
        queue.enqueue(start_node)

        while not queue.is_empty():

            current_node = queue.dequeue()

            for neighbor in self.graph[current_node]:

                if distance[neighbor] == -1:

                    distance[neighbor] = distance[current_node] + 6

                    queue.enqueue(neighbor)

        for node in range(1, self.total_nodes + 1):

            if node != start_node:
                print(distance[node], end=" ")

        print()


test_cases = int(input())

for _ in range(test_cases):

    total_nodes, total_edges = map(int, input().split())

    city_graph = Graph(total_nodes)

    for _ in range(total_edges):

        start, end = map(int, input().split())

        city_graph.add_edge(start, end)

    start_node = int(input())

    city_graph.shortest_distance(start_node)