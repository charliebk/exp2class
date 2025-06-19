class IfcDeepFoundation(IfcBuiltElement):
    def __init__(self):
        pass

    # === EXTENDED BY ===
    # IfcCaissonFoundation
    # IfcPile

    # === WHERE CLAUSES ===
    # CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCDEEPFOUNDATIONTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
