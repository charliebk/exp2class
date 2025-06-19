class IfcFace(IfcTopologicalRepresentationItem):
    def __init__(self):
        self.Bounds: SET [1:?] OF IfcFaceBound = None

    # === EXTENDED BY ===
    # IfcFaceSurface

    # === INVERSE CLAUSES ===
    # HasTextureMaps : SET [0:?] OF IfcTextureMap FOR MappedTo

    # === WHERE CLAUSES ===
    # HasOuterBound : SIZEOF(QUERY(temp <* Bounds | 'IFC4X3_DEV_73740fe4.IFCFACEOUTERBOUND' IN TYPEOF(temp))) <= 1
