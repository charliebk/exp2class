class IfcWallStandardCase(IfcWall):
    def __init__(self):
        pass

    # === WHERE CLAUSES ===
    # HasMaterialLayerSetUsage : SIZEOF (QUERY(temp <* USEDIN(SELF, 'IFC4X3_DEV_73740fe4.IFCRELASSOCIATES.RELATEDOBJECTS') | ('IFC4X3_DEV_73740fe4.IFCRELASSOCIATESMATERIAL' IN TYPEOF(temp)) AND ('IFC4X3_DEV_73740fe4.IFCMATERIALLAYERSETUSAGE' IN TYPEOF(temp.RelatingMaterial)) )) = 1
