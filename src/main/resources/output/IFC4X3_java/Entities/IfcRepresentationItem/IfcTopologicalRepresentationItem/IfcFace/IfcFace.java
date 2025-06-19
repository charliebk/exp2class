public class IfcFace extends IfcTopologicalRepresentationItem {
    public SET [1:?] OF IfcFaceBound Bounds;

    // === EXTENDED BY ===
    // IfcFaceSurface

    // === INVERSE CLAUSES ===
    // HasTextureMaps : SET [0:?] OF IfcTextureMap FOR MappedTo

    // === WHERE CLAUSES ===
    // HasOuterBound : SIZEOF(QUERY(temp <* Bounds | 'IFC4X3_DEV_73740fe4.IFCFACEOUTERBOUND' IN TYPEOF(temp))) <= 1
}
