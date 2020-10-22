require ${BPN}.inc

LIC_FILES_CHKSUM = "file://docs/license.rst;md5=9aa1bc48c9826ad9fdb16661f6930496"
SRC_URI[sha256sum] = "d1a46d9a3f291bc0e0374600bdcb59844fa3eafaa50398e472a36fc65fd0244a"


SRC_URI_append = " file://0001-make-tls-elf-more-optional-mesa-20.2.1.patch \
    file://0002-enable-dri-without-dri-drivers-mesa-20.2.1.patch \
"

VULKAN_DRIVERS = "amd"
EXTRA_OEMESON_remove = "-Dasm=false"