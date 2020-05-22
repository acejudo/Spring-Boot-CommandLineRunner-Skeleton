FROM ansible/centos7-ansible
# Playbook
COPY playbook.yaml /usr/local/bin/
RUN chmod 755 /usr/local/bin/playbook.yaml
# Entrypoint
COPY entrypoint.sh /usr/local/bin/
RUN chmod 755 /usr/local/bin/entrypoint.sh
ENTRYPOINT ["/usr/local/bin/entrypoint.sh"]