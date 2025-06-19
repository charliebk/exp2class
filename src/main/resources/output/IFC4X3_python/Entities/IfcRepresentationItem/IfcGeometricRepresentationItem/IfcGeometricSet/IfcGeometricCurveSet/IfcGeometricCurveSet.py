class IfcGeometricCurveSet(IfcGeometricSet):
    def __init__(self):
        pass

    # === WHERE CLAUSES ===
    # NoSurfaces : SIZEOF(QUERY(Temp <* SELF\IfcGeometricSet.Elements | 'IFC4X3_DEV_73740fe4.IFCSURFACE' IN TYPEOF(Temp))) = 0
