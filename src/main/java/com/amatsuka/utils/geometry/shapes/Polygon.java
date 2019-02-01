package com.amatsuka.utils.geometry.shapes;

import com.amatsuka.utils.geometry.Point;
import com.amatsuka.utils.geometry.exceptions.InvalidVertexException;

import java.util.HashMap;
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

    public Polygon() throws InvalidVertexException {
        if (!isValidVertexes()) {
            throw new InvalidVertexException();
        }
    }

    protected abstract boolean isValidVertexes();

}
