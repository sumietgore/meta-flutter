#
# Copyright (c) 2020-2023 Joel Winarske. All rights reserved.
#

SUMMARY = "Flutter Animated Background"
DESCRIPTION = "Animated Backgrounds for Flutter."
AUTHOR = "André Baltazar"
HOMEPAGE = "https://github.com/AndreBaltazar8/flutter_animated_background"
BUGTRACKER = "https://github.com/AndreBaltazar8/flutter_animated_background/issues"
SECTION = "graphics"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1342931ae82e9996a07db6b1fed984fc"

SRCREV = "2482e1e7feae151f03680deabb2a5f6719af87f9"
SRC_URI = "git://github.com/meta-flutter/flutter_animated_background.git;lfs=0;branch=meta-flutter;protocol=https;destsuffix=git"

S = "${WORKDIR}/git"

PUBSPEC_APPNAME = "animated_background_example"
FLUTTER_APPLICATION_PATH = "example"
FLUTTER_APPLICATION_INSTALL_PREFIX = "/flutter"

inherit flutter-app
