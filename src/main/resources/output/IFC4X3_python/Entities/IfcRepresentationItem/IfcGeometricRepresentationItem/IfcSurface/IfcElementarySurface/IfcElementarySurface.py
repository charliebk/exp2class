class IfcElementarySurface(IfcSurface):
    def __init__(self):
        self.Position: IfcAxis2Placement3D = None

    # === EXTENDED BY ===
    # IfcCylindricalSurface
    # IfcPlane
    # IfcSphericalSurface
    # IfcToroidalSurface
