package com.amatsuka.utils.geometry.shapes;

import com.amatsuka.utils.geometry.Point;
import com.amatsuka.utils.geometry.exceptions.InvalidVertexException;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public abstract class Polygon implements Shape {

    private Map<String, Point> vertexes = new HashMap<>();

    protected Point getVertex(String vertexLiteral) {
        return vertexes.get(vertexLiteral);
    }

    protected void setVertex(String vertexLiteral, Point vertex) {
        vertexes.put(vertexLiteral, vertex);
    }

    protected int vertexCount() {
        return vertexes.size();
    }

    public double perimeter() {

        if (vertexes.size() < 2) {
            return 0;
        }

        double result = 0d;

        Iterator<Map.Entry<String, Point>> iterator = getVertexesIterator();

        Point firstVertex = iterator.next().getValue();
        Point prevVertex = firstVertex;

        while (iterator.hasNext()) {
            Point nextVertex = iterator.next().getValue();

            result += prevVertex.distance(nextVertex);
            prevVertex = nextVertex;
        }

        result += prevVertex.distance(firstVertex);

        return result;
    }

    private Iterator<Map.Entry<String, Point>> getVertexesIterator() {
        return vertexes.entrySet().iterator();
    }
}
