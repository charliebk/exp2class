package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public abstract class IfcTessellatedFaceSet extends IfcTessellatedItem {

    public IfcCartesianPointList3D Coordinates;
    // INVERSE attributes:
    // Dim : IfcDimensionCount := 3;
    // INVERSE attributes:
    // HasColours : SET [0:1] OF IfcIndexedColourMap FOR MappedTo;
    // HasTextures : SET [0:?] OF IfcIndexedTextureMap FOR MappedTo;

    // SUPERTYPE OF:
    // - IfcPolygonalFaceSet
    // - IfcTriangulatedFaceSet SUBTYPE OF IfcTessellatedItem
}
