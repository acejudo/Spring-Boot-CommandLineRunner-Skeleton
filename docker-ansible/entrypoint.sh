#!/bin/bash
mv /etc/ansible/hosts /etc/ansible/hosts.back
touch /etc/ansible/hosts
echo "[localhost]" > /etc/ansible/hosts
ansible-playbook /usr/local/bin/playbook.yaml
#Extra line added in the script to run all command line arguments
exec "$@";